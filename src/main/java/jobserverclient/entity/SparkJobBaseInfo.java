package jobserverclient.entity;

/**
 * 作者: LDL
 * 功能说明:
 * 创建日期: 2015/9/21 17:23
 */
public class SparkJobBaseInfo {
    static final String INFO_EMPTY_VALUE = "empty value";

    /**
     * Status value in a global job information (a <code>SparkJobInfo</code>
     * instance) or a job result/status information
     * (a <code>SparkJobResult</code> instance)
     */
    public static final String INFO_STATUS_ERROR = "ERROR";

    /**
     * Status value in a global job information (a <code>SparkJobInfo</code>
     * instance)
     */
    public static final String INFO_STATUS_FINISHED = "FINISHED";

    /**
     * Status value in a job status/result information (a <code>SparkJobResult</code>
     * instance)
     */
    public static final String INFO_STATUS_OK = "OK";

    /**
     * Status value in a job status/result information (a <code>SparkJobResult</code> instance)
     */
    public static final String INFO_STATUS_STARTED = "STARTED";

    /**
     * Key of status information in the Spark Job Server's json response.
     */
    public static final String INFO_KEY_STATUS = "status";

    /**
     * Key of result information in the Spark Job Server's json response.
     */
    public static final String INFO_KEY_RESULT = "result";

    /**
     * Key of message information of a result item in the Spark Job Server's json response.
     * <p>It presents the global description of the error
     */
    public static final String INFO_KEY_RESULT_MESSAGE = "message";

    /**
     * Key of error class information of a result item in the Spark Job Server's json response.
     * <p>It indicates the error class of current error message
     */
    public static final String INFO_KEY_RESULT_ERROR_CLASS = "errorClass";

    /**
     * Key of stack class information of a result item in the Spark Job Server's json response.
     * <p>It shows the information of java/scala exception stack
     */
    public static final String INFO_KEY_RESULT_STACK = "stack";

    /**
     * Key of context information of a result item in the Spark Job Server's json response.
     * <p>It's the context name.
     */
    public static final String INFO_KEY_CONTEXT = "context";

    /**
     * Key of context information of a result item in the Spark Job Server's json response.
     * <p>It shows the job id of the target spark job
     */
    public static final String INFO_KEY_JOB_ID = "jobId";

    private String status;
    private String message;
    private String errorClass;
    private String[] stack;
    private String context;
    private String jobId;
    protected String contents;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
