# jakarta-ee-beispiele
Beispiele zu Jakarta EE 10 und höher

* **primefaces-schnellstart:** JSF 4.0 Anwendung mit PrimeFaces 14.x

## Ausführen

Alle in diesem Multi-Maven-Projekt untergebrachten Beispiele
müssen auf einem Application-Server ausgeführt werden.

Um die Ausführung möglichst einfach zu gestalten, enthält jedes Modul Shell-Scripte, die das benötigte Artefakt bauen
und anschließend per Docker bereitstellen.

### Vorbedingungen

* Docker ist auf der Ausführungsplattform installiert, der Daemon ist gestartet und per Konsole (docker) erreichbar
* Maven ist auf der Ausführungsplattform installiert und per Konsole ausführbar (mvn)
* Java JDK 21 ist vorhanden und per Konsole ausführbar (java)

### Vorbereitung

* Das gesamte Projekt (jakarta-ee-beispiele) per git clonen

### Starten

Das jeweilige Beispiel kann per Shell-Skript gestartet werden:

* **<beispiel-modul>/docker/run-with-build.sh:** Baut das Artefakt, erzeugt das Docker Image inklusive Artefakt und
  startet
  den Container
* **<beispiel-modul>/docker/run.sh:** Erzeugt das Docker Image inklusive Artefakt und startet den Container

### Alternative

Selbstverständlich kann jedes Beispiel-Artefakt auf herkömmlichem Weg über Maven gebaut und anschließend auf einen
beliebigen Jakarta EE 10 fähigen Application-Server installiert werden (z.B.
WildFly: https://www.wildfly.org/downloads/)
