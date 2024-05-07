# tech-challenge-02
Tech Challenge FIAP - segunda fase

## Link do Miro:
https://miro.com/app/board/uXjVNTlNjME=/

## Link do vídeo no Youtube:
https://youtu.be/UDvjPcwxJG4

## Como rodar Kubernetes:
Baixar e instalar minikube: https://minikube.sigs.k8s.io/docs/start/

## Comandos
Após instalar o minikube, dentro da pasta raiz do projeto(Onde estão os arquivos yaml) rodar os comandos abaixo:

minikube start  

kubectl apply -f .\api-deployment.yaml  

## Teste

kubectl apply -f .\api-service.yaml  

kubectl port-forward service/java-api-service 8080:80 

## Testar a aplicação:
Para testar a aplicação basta importar a Collection(anexa na raiz do projeto) no Postman e enviar as requisições
