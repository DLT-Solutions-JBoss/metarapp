FROM registry.access.redhat.com/jboss-eap-6/eap64-openshift:1.4

USER root

ADD appdynamics/ /opt/appdynamics/

RUN chgrp -R 0 /opt/appdynamics/
RUN chmod -R g+rw /opt/appdynamics/
RUN find /opt/appdynamics/ -type d -exec chmod g+x {} +

#jboss from EAP
USER 185
