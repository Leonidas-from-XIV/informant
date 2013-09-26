(ns informant.core-test
  (:require [midje.sweet :refer :all]
            [informant.core :refer :all]))

(defn- test-doc
  "Docstring"
  [])

(fact "`inform` returns the documentation of functions"
      (:doc (inform 'test-doc)) => "Docstring"
      (:arglists (inform 'test-doc)) => '([])
      (:name (inform 'test-doc)) => test-doc
      (:private (inform 'test-doc)) => true)
