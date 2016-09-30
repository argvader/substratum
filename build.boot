#!/usr/bin/env boot

(set-env!
  :source-paths  #{"src"}
  :dependencies '[[adzerk/boot-reload          "0.4.5"           :scope "test"]
                  [pandeiro/boot-http          "0.7.3"           :scope "test"]
                  [danielsz/boot-environ       "0.0.5"           :scope "test"]
                  [org.clojure/clojure         "1.8.0"]
                  [cheshire                    "5.5.0"]
                  [ring/ring-devel             "1.4.0"]
                  [ring-middleware-format      "0.7.0"]
                  [http-kit                    "2.1.19"]
                  [ring/ring-json              "0.4.0"]
                  [compojure                   "1.4.0"]
                  [com.cemerick/friend         "0.2.1"]
                  [overtone/at-at              "1.2.0"]
                  [environ                     "1.0.2"]])
