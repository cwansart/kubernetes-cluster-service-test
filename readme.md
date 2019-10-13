# Requirements

This example assumes you use Minikube (https://kubernetes.io/docs/tasks/tools/install-minikube/).

# Build and deploy

`$ ./buildAndDeploy.sh`

# Access the app via browser

`$ minikube service greeting-service-service`

The route to the resource is: `/api/greetings`

# Delete services and deployments

`$ kubectl delete -f config`
