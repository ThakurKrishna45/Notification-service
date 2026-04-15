# Notification-Service 
* A specialized microservice designed to handle asynchronous user alerts within a distributed banking ecosystem. Built using an **Event-Driven Architecture**, this service ensures that the core banking system remains decoupled and performant.
---
## Tech Stack Used
* **Backend:** SpringBoot
* **Messaging:** Kafka
* **Containerization:** Docker & Docker Compose
---
## How to use
### Prerequisites
* Docker & Docker Compose 
* Running instance of Kafka (handled automatically via the Banking-System's compose file)
### Deployment
This service is designed to run alongside the main banking backend.
Start the Infrastructure: Ensure the Banking System ([https://github.com/ThakurKrishna45/Banking-System]) is up and running first.
Run this Service:
```docker compose up --build
```
👨‍💻 Author
Krishna Pratap Singh
Backend Developer | Java | Spring Boot
