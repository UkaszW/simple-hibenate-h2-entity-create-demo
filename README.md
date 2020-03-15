# simple-hibenate-h2-entity-create-demo

Requirements:
- jdk 11

To build run:
`mvn install`

To enter h2 memory DB (credentials in application.properties file):
`<application>/h2-console/`

API (`api/v1`):
- `/hello` GET
- `/item/all` GET
- `/item/{id}` GET
- `/item/{id}` DELETE
- `/warehouse/all` GET
- `/warehouse/{id}` GET
- `/warehouse/{id}` DELETE

For example: to get all items make GET request on address: `<application>/api/v1/item/all`