(defproject url-shortener "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
		[http-kit "2.1.16"]
		[com.taoensso/carmine "2.6.2"]
		[commons-validator/commons-validator "1.4.0"]
                ]
  :main ^:skip-aot url-shortener.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

