# ImperialAPICalculator
Britain thinks about reusing their old imperial measurements. Your client wants you to write an API that converts imperial values to metric ones. • Inch to Centimeter • Yard to Meter


![grafik](https://user-images.githubusercontent.com/105013150/175044939-19c97e5c-bb83-4727-9121-8bbaec54ad1e.png)

Dokumentation Abschlussprüfung
Software Lifecycle Management 
BWI-BB-2-SS2022

wi21b055
Wolfgang Matyus


# 1.	Git/Github
**I.	Zuerst wird ein neues Repository in Github erstellt. Dabei wird**

i.	ein README File 
ii.	ein .gitignore für Maven
iii.	und eine MIT License hinzugefügt.

![grafik](https://user-images.githubusercontent.com/105013150/175053289-d66c02b7-93ea-4ed2-b347-d62be2fc9f66.png)

II.	Weiters wird ein „develop“ branch hinzugefügt als Zwischenspeicher zum Schutz der main branch.

![grafik](https://user-images.githubusercontent.com/105013150/175053699-8c38cc4d-9177-4142-94b8-b08194817a99.png)


# 2.	User Stories
**I.	Als nächstes wird ein neues Projekt mit dem Basic Kanban Template erstellt.**

![grafik](https://user-images.githubusercontent.com/105013150/175054553-b83ba12b-52a1-4ecf-8e91-5c012954fea7.png)


II.	Die bestehenden Notes aus dem Template werden entfernt und die ersten User Stories als Notes erfasst.

![grafik](https://user-images.githubusercontent.com/105013150/175056542-34745512-b4c4-4c07-a22d-d28e438abed5.png)


III.	Die Notes werden dann in Issues umgewandelt und zugewiesen und wandern für die Implementierung zur Spalte „In progress“ und werden dadurch in Bearbeitung genommen.

![grafik](https://user-images.githubusercontent.com/105013150/175057868-f3321a13-bf4e-4165-9eeb-865d3a8fd8ec.png)


IV.	Das Issue wird einem Bearbeiter assigned und als feature/ einer neuen feature branch zugewiesen.
 
![grafik](https://user-images.githubusercontent.com/105013150/175058558-6ecfccfa-2f45-44dd-85f9-667826cf6d22.png)


# 3.	Impelmentierung

Nun beginnen wir mit der Umsetzung der ersten Userstory und setzten ein Neues Java Projekt auf.


**I.	Ein neues IntelliJ Java Projekt mit Spring Boot wird erstellt

![grafik](https://user-images.githubusercontent.com/105013150/175059495-90f4c827-b020-4f87-bbc6-b47ed9f4bb9a.png)

i.	Name und Lokales Verzeichnis werden vergeben

C:\FHTW\SS2022\SLM\ImperialAPICalculator

ii. bei einem ersten TEST des localhost auf Port 8080 erkennen wir das derzeit keine Verbindung herstellt werden kann.
![grafik](https://user-images.githubusercontent.com/105013150/175061142-cfb6c3f9-7621-4b84-8e9d-3e1cf15299af.png)

iii. wird Spring boot gestartet bekommen wir den Error 404, dass der Server nicht erreichbar ist.
![grafik](https://user-images.githubusercontent.com/105013150/175063731-c09b715a-c460-4493-b3d4-e4067fe87583.png)

iv. Wenn wir nun testweise eine Route mit Rückgabewert implementieren wird und der Rückgabewert angezeit.
![grafik](https://user-images.githubusercontent.com/105013150/175063479-1ff005f9-f292-469e-8c08-9538a1905c7c.png)
![grafik](https://user-images.githubusercontent.com/105013150/175064186-030b7866-8694-435d-8f62-1b4730634b9a.png)

**II. Wir können also nun damit beginnen unser online GIT Repo mit dem lokalen Repo zu verknüpfen und das erste feature/ bearbeiten und abschließen.

i. da

V.	Die erstellte feature/ branch muss nun gefetched werden und nach einem Checkout kann innerhalb der feature/ branch mit der Erstellung des Codes begonnen werden.




VI.	Wurde der Code fertiggestellt, commited und gepushed Kann das feature in Github über den Pull Request auf eventuelle Fehler untersucht werden und in den develop branch gemerged werden. Das Issue ist somit erledigt und kann auf Done verschoben und geclosed werden. 
