
#!/usr/bin/env boot

(set-env!
 :resource-paths #{"src"}
 :dependencies `[
    [org.clojure/clojure ~(clojure-version) :scope "provided"]
    [http-kit "2.2.0"]
    [io.weft/gregor "0.5.1"]
    ])

(deftask serve []
  "development server start"
  )
