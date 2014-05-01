(ns site.core
  (:require [ring.adapter.jetty :as jetty]))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "I'm Kirstie and I'm a software developer.\n\nYou can find me on twitter @krstck and Github @kirstiecook or by email using kc@ this domain.\n\nThis site, humble as it currently is, is completely open source: https://github.com/kirstiecook/kirstiecook"})

(defn -main [port]
  (jetty/run-jetty app {:port (Integer. port) :join? false}))