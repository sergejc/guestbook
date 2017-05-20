(ns guestbook-clojure.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[guestbook-clojure started successfully]=-"))
   :middleware identity})
