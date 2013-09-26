(ns informant.core)

(defn inform
  "Returns the doc"
  [sym]
  (if-let [special-name ('{& fn catch try finally try} sym)]
    (@#'clojure.repl/special-doc special-name)
    (cond
      (@#'clojure.repl/special-doc-map sym) (@#'clojure.repl/special-doc-map sym)
      (find-ns sym) (@#'clojure.repl/namespace-doc (find-ns sym))
      (resolve sym) (meta (resolve sym)))))
