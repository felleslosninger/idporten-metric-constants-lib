package no.idporten.metric.constants;

public class MetricValues {

    // for internal apis inside namespace
    public final static String EXTERNAL_SYSTEM_INTERNAL_API= "internal_api";

    // for external apis outside of namespace
    public final static String EXTERNAL_SYSTEM_EXTERNAL_API= "external_api";
    public final static String EXTERNAL_SYSTEM_REDIS= "redis";
    public final static String EXTERNAL_SYSTEM_DB= "database";
    public final static String EXCEPTION_TYPE_CONNECT= "connect";
    public final static String EXCEPTION_TYPE_TIMEOUT= "timeout";

    // oidc operations
    public final static String OIDC_OPERATION_PAR = "par";
    public final static String OIDC_OPERATION_TOKEN = "token";
    public final static String OIDC_OPERATION_AUTHORIZE = "authorize";
    public final static String OIDC_OPERATION_DURATION_PAR_AND_AUTH = "duration_par_and_auth";


}
