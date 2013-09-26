# informant

All the function/macro/special-form meta data you always wanted to know. Well,
basically a programmatically usable `doc`.

## Usage

```clj
(use 'informant.core)
(inform 'clojure.core/mod)
;=> {:ns #<Namespace clojure.core>,
;    :name mod,
;    :arglists ([num div]),
;    :column 1,
;    :added "1.0",
;    :static true,
;    :doc "Modulus of num and div. Truncates toward negative infinity.",
;    :line 3216,
;    :file "clojure/core.clj"}
```

## License

Copyright © 2013 Marek Kubica

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
