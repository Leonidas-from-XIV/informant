(ns informant.core
  (:require [clojure.repl :as repl]))

(defn inform
  "Returns the doc"
  [sym]
  (let [special-doc @#'repl/special-doc
        special-doc-map @#'repl/special-doc-map
        namespace-doc @#'repl/namespace-doc]
    (if-let [special-name ('{& fn catch try finally try} sym)]
      (special-doc special-name)
      (cond
        (special-doc-map sym) (special-doc-map sym)
        (find-ns sym) (namespace-doc (find-ns sym))
        (resolve sym) (meta (resolve sym))))))
