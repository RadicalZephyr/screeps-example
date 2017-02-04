(def project 'screeps-example)
(def version "0.1.0-SNAPSHOT")

(set-env! :resource-paths #{"src"}
          :dependencies   '[[org.clojure/clojure "1.8.0"]
                            [radicalzephyr/boot-screeps "0.1.0-SNAPSHOT"]])

(task-options!
 pom {:project     project
      :version     version})

(deftask build
  "Build and install the project locally."
  []
  (comp (pom) (jar) (install)))
