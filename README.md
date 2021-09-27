docker-compose -f ./docker-compose.yml up -d

URL for keycloak http://localhost:8090/

docker cp /target/kc-extension-1.0-SNAPSHOT.jar keycloak:/opt/jboss/keycloak/standalone/deployments/