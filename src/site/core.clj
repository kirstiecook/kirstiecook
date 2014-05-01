(ns site.core)

(defn handler [request]
	{:status 200
	 :headers {"Content-Type" "text/html"}
	 :body "To do: make todo list"})