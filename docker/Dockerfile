FROM eclipse-temurin:17-jdk

RUN apt-get update
RUN apt-get install -y dh-make debhelper

ARG CURRENT_USER_ID
ARG CURRENT_GROUP_ID

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

USER "${CURRENT_USER_ID}":"${CURRENT_GROUP_ID}"
ENTRYPOINT ["/entrypoint.sh"]
CMD ["sh"]
