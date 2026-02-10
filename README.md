# 📂 Java NIO.2 & File Watchdog Service

> Implementação avançada de manipulação de sistemas de arquivos e monitoramento em tempo real utilizando as APIs modernas do Java.

![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![NIO.2](https://img.shields.io/badge/API-NIO.2-blue?style=for-the-badge)

## 📌 Sobre o Projeto
Este repositório contém a implementação de um serviço de monitoramento de diretórios (`WatchDog`) e um manipulador de ficheiros (`FileService`). O objetivo é demonstrar como o Java 21 pode interagir de forma eficiente com o Sistema Operacional para reagir a eventos de criação, modificação e eliminação de ficheiros.

## 🚀 O que este projeto faz?
- **Monitoramento Ativo:** Utiliza `WatchService` para detetar alterações em pastas sem necessidade de loops infinitos manuais.
- **Gestão de I/O:** Leitura e escrita de ficheiros utilizando `java.nio.file`, garantindo melhor performance que o antigo `java.io.File`.
- **Modularidade:** Separação clara entre a lógica de evento e a persistência de dados.

## 🛠️ Tecnologias Utilizadas
- **Java 21 LTS**
- **Maven** (Gestão de dependências)
- **WatchService API**

## 🧠 Aprendizados
- Configuração de eventos nativos do SO via Java.
- Manipulação de Paths e Files com a API NIO.2.
- Estruturação de código limpo para serviços de background.
