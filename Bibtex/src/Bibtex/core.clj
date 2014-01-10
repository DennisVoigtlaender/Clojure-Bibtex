(ns Bibtex.core)
(require '[clj-http.client :as client])
(require '[clojure.xml :as xml]'[clojure.zip :as zip])

stop
(client/get "http://google.com")
(def erg (client/get "http://dblp.uni-trier.de/search/author?xauthor=Schek")) ; clj-http
(defn zip-str [s]
  (zip/xml-zip (xml/parse (java.io.ByteArrayInputStream. (.getBytes s)))))
(def erg2 (zip-str (erg :body)))
(def author ((erg2 0) :content))
(author 1)