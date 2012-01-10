(defproject clj-logstore "0.1.0-SNAPSHOT"
  :description "syslog-ng PE logstore reader"
  :aot :all
  :dependencies [
                 [org.clojure/clojure "1.3.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [slingshot "0.10.1"]
                 ]
  :dev-dependencies [
                     [lein-marginalia "0.6.1"]
                     [midje "1.3.1"]
                     [lein-midje "1.0.7"]
                     ]
  :run-aliases {
                :test1 balabit.logstore.scripts.test1/main
                }
  )
