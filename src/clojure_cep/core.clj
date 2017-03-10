(ns clojure-cep.core
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(defn url [cep] (str "http://viacep.com.br/ws/" cep "/json"))

(defn viacep
  "Fetches the CEP via ViaCEP"
  [cep]
  (-> cep
      (url)
      (client/get)
      (get :body)
      (clojure.string/replace #"\n\ \ " "")
      (json/read-str)
      ))
