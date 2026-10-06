# Try Fishing — API REST

> Plataforma backend para gerenciamento de expedições de pesca esportiva, mapeamento de pontos e controle de equipamentos.

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2-Database-003545?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

O **Try Fishing** é uma API RESTful projetada para pescadores esportivos gerenciarem suas expedições. A plataforma permite mapear locais de pesca, registrar espécies, organizar o inventário de tralhas e criar um diário detalhado de capturas com métricas de peso, comprimento, clima e mídias.

---

## 🛠️ Features

* **Gestão de Locais:** Mapeamento de pontos de pesca com coordenadas geográficas (latitude/longitude) e tipo de ambiente (rio, mar, pesqueiro, represa).
* **Catálogo de Espécies:** Registro de espécies com suporte a controle de tamanhos mínimos legais e épocas de defeso.
* **Controle de Equipamentos:** Gerenciamento de inventário de varas, molinetes, carretilhas e iscas.
* **Diário de Capturas:** Registro completo de fisgadas com histórico de peso, comprimento, modalidade (pesque e solte) e equipamentos utilizados.
* **Consultas Otimizadas:** Endpoints paginados para rankings de troféus e filtragem por parâmetros combinados.

---

## ⚙️ Tech Stack

* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3.x
* **Persistência de Dados:** Spring Data JPA / Hibernate
* **Banco de Dados:** H2 Database (File Mode)
* **Ferramentas:** Lombok, Bean Validation, Maven

---

## 📐 Arquitetura e Boas Práticas

* **Layered Architecture:** Segregação clara de responsabilidades entre Controller, Service, Repository, Entity e DTO.
* **Data Transfer Objects (DTO):** Desacoplamento entre as entidades do banco de dados e a interface da API.
* **CORS Configured:** Pronto para consumo por aplicações web (React/Vue) ou mobile (Flutter/React Native).
* **Paginação Nativa:** Consultas com suporte a `Pageable` para otimização de tráfego de dados.# Try-Fishing
