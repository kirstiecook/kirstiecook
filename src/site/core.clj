(ns site.core
  (:require [ring.adapter.jetty :as jetty]))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "to do: make todo list"})

(defn -main [port]
  (jetty/run-jetty app {:port (Integer. port) :join? false}))