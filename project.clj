(defproject com.balabit/logstore "0.0.1-SNAPSHOT"
  :description "syslog-ng PE logstore reader"
  :url "http://algernon.github.com/balabit.logstore"
  :mailing-list {:name "Syslog-ng users' and developers' mailing list"
                 :archive "http://lists.balabit.hu/pipermail/syslog-ng"
                 :post "syslog-ng@lists.balabit.hu"
                 :subscribe "syslog-ng-request@lists.balabit.hu?subject=subscribe"
                 :unsubscribe "syslog-ng-request@lists.balabit.hu?subject=unsubscribe"}
  :license {:name "GNU General Public License - v3"
            :url "http://www.gnu.org/licenses/gpl.txt"
            :distribution :repo}
  :aot :all
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [slingshot "0.10.1"]
                 [joda-time/joda-time "2.0"]
                 [gloss "0.2.1-rc1"]]
  :dev-dependencies [[lein-marginalia "0.7.0"]
                     [midje "1.3.1" :exclusions [org.clojure/clojure]]
                     [lein-midje "1.0.7"]
                     [lein-clojars "0.8.0"]
                     [lein-exec "0.1"]])
