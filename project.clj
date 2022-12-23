(defproject io.replikativ/datahike-jdbc "0.1.2"
  :description "Datahike with JDBC data storage backend"
  :license {:name "Eclipse"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "http://github.com/replikativ/datahike-jdbc"
  :dependencies [[org.clojure/clojure "1.10.1" :scope "provided"]
                 [environ "1.2.0"]
                 [com.taoensso/timbre "5.1.2"]
                 [io.replikativ/datahike "0.6.1526"]
                 [alekcz/konserve-jdbc "0.1.1"]]
  :plugins [[lein-cljfmt "0.7.0"]]
  :deploy-repositories
  [["clojars"
    {:url           "https://clojars.org/repo"
     :username      :env
     :password      :env
     :sign-releases false}]])
