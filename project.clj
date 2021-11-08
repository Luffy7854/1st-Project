
(ns clojure.examples.hello
        (:gen-class))

(def Parc #{"Bertramka" "Frantiskanska zahrada" "Obora Hvezda" "Kampa" "Kinsheho Zahrada" "Kalmovka" "Ladronka" "Letna" "Petrin" "Riegrovy sady" "Stromovka" "Vojanovy Sady" "Vysehrad" "bertramka" "frantiskanska>(def Parc2 #{"Petrin" "Riegrovy-sady" "Stromovka" "Vojanovy-Sady" "Vysehrad" "Bertramka" "Frantiskanska-zahrada" "Obora-Hvezda" "Kampa" "Kinsheho-Zahrada" "Kalmovka" "Ladronka" "Letna"})
(def localisation #{"where"})
(def informations #{"informations" "INFORMATIONS" "INFORMATION"})
(def help #{"HELP" "help"})
(def étinéraire #{"itinerary" "Itinerary" "Path" "path"})


(defn restart[]
        (println "Program finish...") (shutdown-agents) )


(let [yayinput (read-line)]
  (if (= yayinput "hello")
    (println "Program starting...")
   ((restart) println " ")))



(println "1st Project of Symbolic Computation, chatbot Bastien")
(println " ")

(println "Hello, do you whant to start the chatbot Y/N?:  ")
 (let [yayinput (read-line)]
  (if (= yayinput "Y")
    (println "Ok let's start!")
   ((restart) println "wrong")))

(println "What's your name ?: ")
(def x (read-line))
(println "Hello"x"!")
(println " ")


(println "###################################################################")

(println "Voici tout les parcs a Prague:")
(println Parc2)
(println "[PRESS ENTER]")
(def r (read-line))

(println "INFORMATIONS or HELP ? ")
(let [p (read-line)]
(if (= p "INFORMATIONS")

 {  (println "About wich Parc ?:")
  (let [z (read-line)]
  (cond
  (contains? Parc z)

{  (println "le parc" z ", Ok pas de problème que vous voullez vous savoir ?:")
    (let [v (read-line)]
    (cond
    (contains? étinéraire v)
    (println "OK, l'étinaire  pour"z"est ...")
    (println "Je ne comprend pas votre demande...")

   ((restart) println "wrong")))}
  :else (println "Nous ne comprenons pas votre demande..."))(restart))}



(println "Some Chatbot command:
- Etinéraire (for know the path)")))
