#!/usr/bin/env sh
eval $(minikube docker-env)
kubectl delete -f config
docker build greeting-service -t greeting-service:1.0-SNAPSHOT
docker build user-service -t user-service:1.0-SNAPSHOT
kubectl apply -f config

echo "Run"
echo "$ minikube service greeting-service"
echo "To open the service"