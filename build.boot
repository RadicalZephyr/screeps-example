(def project 'screeps-example)
(def version "0.1.0-SNAPSHOT")

(set-env! :source-paths #{"src"}
          :resource-paths #{"resources"}
          :dependencies   '[[org.clojure/clojure "1.8.0"]
                            [radicalzephyr/boot-screeps "0.1.0-SNAPSHOT" :scope "test"]
                            [adzerk/boot-cljs "1.7.228-2" :scope "test"]])

(task-options!
 pom {:project     project
      :version     version})

(require '[adzerk.boot-cljs :refer [cljs]])
