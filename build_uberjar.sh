#!/bin/bash

lein uberjar
export DATABASE_URL=jdbc:h2:./guestbook_clojure_dev.db
java -jar target/guestbook-clojure.jar
