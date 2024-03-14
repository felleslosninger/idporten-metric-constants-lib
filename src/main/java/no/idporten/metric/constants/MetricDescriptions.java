package no.idporten.metric.constants;

public class MetricDescriptions {

    public final static String APP_EXCEPTION_DATABASE_DESCRIPTION= "Counter for connection problems from application to database";
    public final static String APP_EXCEPTION_REDIS_DESCRIPTION= "Counter for connection problems from application to Redis";
    public final static String APP_EXCEPTION_INTERNAL_API_DESCRIPTION= "Counter for API connection problems from application to another internal application in namespace";
    public final static String APP_EXCEPTION_EXTERNAL_API_DESCRIPTION= "Counter for API connection problems from application to external API";

}
