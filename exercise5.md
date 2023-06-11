# um einen logger zu erstellen man braucht die Bibliotek log4j2

# log4j-api & log4j-core

# die Log Levels sind folgendes und sie werden benutzt abhängig von der Wichtigkeit: 
Standard Level
intLevel


OFF
0

FATAL
100

ERROR
200

WARN
300

INFO
400

DEBUG
500

TRACE
600

ALLInteger.MAX_VALUE

# für Konfiguration gibt es einen default, aber zeichnet nicht alle log levels
# Es gibt die Möglichkeit um einen log4j2.xml zu kreiren um Logging zu konfigurieren
# Wir können konfiguriren wo und mit  welchem Detail oder welchem Pattern bzw. Name geschrieben werden
# es gibt mehrere Dateien wie z.B .properties, yaml, json zu Verfügung