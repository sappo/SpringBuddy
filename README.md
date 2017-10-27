# SpringBuddy

Willkommen zum Detim ByteBuddy Workshop.

Dieses Projekt stellt dir eine Grundlage für die folgenden Aufgaben.

Viel Vergnügen!!!

## Aufgaben

1. In der ersten Aufgabe sollst du dich mit dem ByteBuddy Builder vertraut
   machen, indem du die Entitätsklassen für Country und Location erzeugst. Nutze
   zur Orientierung das Datenbank Schema 
   (siehe src/main/resources/liquibase/database_schema.png). Anschließend 
   modifiziere das RegionRepositories um die Klassenannotation 
   @RepositoryRestResource. Erzeuge noch demselben Vorbild mit ByteBuddy die
   Repositories für Country und Location. Zur Überprüfung nutze die Tests für 
   die erste Aufgabe (WorkshopAufgabe1Tests).
   
2. Baue mit ByteBuddy einen eigenen Controller. Dieser soll via POST Daten 
   annehmen und diese in der Klasse transient speichern. Über eine GET Abfrage
   soll der gespeicherte Wert wieder abgerufen werden können. Für den Fall, dass
   noch kein Wert gespeichert wurde gibt einen Defaultwert zurück.
   
3. Baue mit ByteBuddy einen EmployeeController der über den Pfad /employees alle
   Employees aus der Datenbank zurückgibt. Dabei sollen Vorname und Nachname als
   in einem Feld Name konkateniert werden. Nutze dazu den PipeForwarder um auf 
   die Attribute der Employee Entitäten zuzugreifen. Andere Tricks, wie Spring
   Data Rest Projections und Konkatenation über Spring EL sind verboten ;)

4. Erweitere deinen Controller aus Aufgabe 2 um mindesten eine PUT und DELETE  
   Schnittstelle. Schreibe jeweils einen ByteBuddy Logger für die vier HTTP 
   Aufrufe GET; PUT; POST; DELETE; und schreibe die Parameter und den Return
   Wert in das Log.

Wenn du hier angekommen bist schreie ganz laut BINGO!!!