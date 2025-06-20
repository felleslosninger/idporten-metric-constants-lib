package no.idporten.metric.constants;

public class MetricNames {
    public final static String APP_EXCEPTION_NAME= "app_exceptions";


    // Only for idporten-login for dynamic create counters since we allready has the APP_EXCEPTION_NAME defined, then new counters with same name is not added.
    public final static String APP_EXCEPTION_INTERNAL_API_NAME= "app_exceptions_internal_api";
    public final static String APP_OIDC_OPERATIONS_COUNTER_NAME= "app_oidc_operations_counter";

}
