(ns informant.core-test
  (:require [midje.sweet :refer :all]
            [informant.core :refer :all]))

(fact "`inform` returns the documentation of clojure.core functions"
      (:doc (inform clojure.core/mod)) => "Foobar")
