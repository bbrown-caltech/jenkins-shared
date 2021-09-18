package caltech.simplilearn

/**
 * Defines constants for the Jenkins environment.
 *
 * @author Brian Brown
 */

class JenkinsConstants {
    public static final CREDENTIALS_ID = 'caltech'
    public static final DOCKER_REGISTRY = 'docker.brianbrown.me'
    public static final HELM_IMAGE = 'docker.brianbrown.me/tools/debian-11/helm:3.7.0'
    public static final HELM_REPOSITORY = "https://nexus.brianbrown.me/repository/helm/"
    public static final CHART_OUTPUT_DIRECTORY = "/charts"
}