<h1 align=center>
    Microservices Architecture Project 🚀
</h1>

Welcome to the Microservices Architecture Project, developed as part of the Microservices Architecture course at the University of Quindío. This project demonstrates a robust microservices architecture using a variety of technologies and design patterns for optimal scalability, reliability, and monitoring. All microservices are containerized and orchestrated via Docker Compose, ensuring smooth inter-service communication and easy deployment. 🌐

## Microservices Overview 📋

1. **Authentication Service** 🔐  
   - Built with Java.
   - Uses JWT for secure authentication.
   - Connects to a MongoDB database via JDBC.

2. **BDD Testing Service** 🧪  
   - End-to-end tests written with Gherkin in Cucumber.js.
   - Covers all project microservices, generating a detailed HTML report of test results.

3. **Logging Service** 📜  
   - Developed with Java.
   - Utilizes MongoDB via Sequelize ORM.
   - Listens to logs from a NATS server to track system activity.

4. **Health & Monitoring Service** 🩺  
   - Implemented Loki (logs) and Promtail (log collection). Prometheus (metrics collection).
   - Monitors the `/health` endpoint of all microservices and sends email alerts to service owners if a service is down.

5. **Account Management Service** 👥  
   - Built with Node.js and express & mongoose.
   - Integrates with MongoDB.
   - Listens for user registration messages from the Authentication Service via NATS to create associated user accounts.

6. **Notification Service** 🔔  
   - Developed with Spring Boot.
   - Utilizes RabbitMQ to receive alerts from Prometheus (via Alertmanager).
   - Saves notification records in MongoDB.
   - Sends notifications via email using a third-party API (SMTP).
   - Automatically processes alerts routed from the Monitoring Service (Prometheus → Alertmanager → RabbitMQ).

7. **Gateway Service** 🚪  
   - Centralizes incoming requests and routes them to the appropriate microservices.
   - Built with Fastify in JavaScript for efficient request handling.

8. **Jenkins Auto-Configuration Package** ⚙️  
   - Automates the execution of BDD tests using Cucumber.js in Jenkins for continuous testing.

---

This project showcases a comprehensive microservices architecture with advanced monitoring, logging, testing, and deployment practices. Contributions and feedback are welcome as we continue to enhance and optimize this system!
