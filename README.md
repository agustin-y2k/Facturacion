![madewith](https://img.shields.io/badge/made%20with-SpringBoot-green?logo=spring&style=for-the-badge)

# Connect to Data Base

**Set up application.properties inside resources edit**

Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)

    spring.datasource.url
    
    spring.datasource.username
    
    spring.datasource.password

The SQL dialect makes Hibernate generate better SQL for the chosen database

    spring.jpa.properties.hibernate.dialect
    
    logging.level.org.hibernate.SQL

Hibernate ddl auto (create, create-drop, validate, update)

    spring.jpa.hibernate.ddl-auto

# HOW TO USE?

## Querys from browser

### Product

GET all products: 

    localhost:8080/api/productos

GET by id: 

    localhost:8080/api/productos/id

GET/search: 

    localhost:8080/api/productos/search?query=whatever-you-want

### Client

GET all clients: 

    localhost:8080/api/clientes

GET by id: 

    localhost:8080/api/clientes/id

GET/search: 

    localhost:8080/api/clientes/search?query=whatever-you-want

### Business

GET all Business: 

    localhost:8080/api/empresa

GET by id: 

    localhost:8080/api/empresa/id

### Bill

GET all bills: 

    localhost:8080/api/facturas

GET from id: 

    localhost:8080/api/facturas/id

GET by cliente id: 

    localhost:8080/api/facturas/id-client

---------------------------------------

## Using Curl

### Product

    { 
        "id" : id,
        "codigo": "code",
        "nombre": "name",
        "descripcion": "description",
        "precio": float-price
    }

GET: 

    curl -X GET {route}

POST: 

    curl -X POST -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/productos

PUT: 

    curl -X PUT -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/productos

DELETE: 

    curl -X DELETE {route}

### Client

    {
        "id" : id,
        "nombre": "name",
        "cuit": "cuit",
        "direccion": "adderess",
        "condicionIva": "RESPONSABLE_INSCRIPTO" or "MONOTRIBUTISTA" or "CONSUMIDOR_FINAL"
    }

GET: 

    curl -X GET {route}

POST: 

    curl -X POST -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/clientes

PUT: 

    curl -X PUT -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/clientes

DELETE: 

    curl -X DELETE {route}

### Business


    {
        "nombre" : "name",
        "direccion" : "address",
        "provincia" : "province",
        "pais" : "country",
        "cuit" : "cuit",
        "codigo_postal" : "zip code",
        "ciudad" : "city",
        "condicionIva" : "RESPONSABLE_INSCRIPTO" or "MONOTRIBUTISTA"
    }
    
GET: 

    curl -X GET {route}

POST: 

    curl -X POST -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/empresa

PUT: 

    curl -X PUT -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/empresa

DELETE: 

    curl -X DELETE {route}

### Bill

    {
        "encabezado" : {
            "cliente" : {
                "id" : id
            }
        },

        "items" : [
            {
                "producto" : {
                    "id" : id
                },
                "cantidad" : num
            },
            {
                "producto" : {
                    "id" : id
                },
                "cantidad" : num
            }
            ],
            "pie" : {
                "observaciones" : "observations"

            }
    }

GET: 

    curl -X GET {route}

POST: 

    curl -X POST -d '{insert json}'  -H 'Content-Type: application/json' localhost:8080/api/facturas

DELETE: 

    curl -X DELETE {route}
