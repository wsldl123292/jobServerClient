package jobserverclient;


import jobserverclient.client.SparkJobServerClientFactory;
import jobserverclient.globle.ISparkJobServerClient;

import java.io.IOException;

/**
 * 作者: LDL
 * 功能说明:
 * 创建日期: 2015/9/21 17:06
 */
public class JobServerClient {
    public static void main(String[] args) throws IOException {

        ISparkJobServerClient client = null;
        try {
            client = SparkJobServerClientFactory.getInstance().createSparkJobServerClient("http://192.168.1.212:8090/");
            //GET /jars
            /*final List<SparkJobJarInfo> jarInfos = client.getJars();
            System.out.println("Current jars:");
            for (SparkJobJarInfo sparkJobJarInfo : jarInfos) {
                System.out.println(sparkJobJarInfo.getJarName() + "..." + sparkJobJarInfo.getUploadedTime());
            }*/

            //POST /jars/<appName>
            /*boolean upFlag = client.uploadSparkJobJar(new
                    File("F:\\GitHub\\everythingtest\\sparkhbase\\target\\sparkhbase-1.0.jar"), "sparktest");
            System.out.println(upFlag);*/

            //GET /contexts
            /*final List<String> contexts = client.getContexts();
            System.out.println("Current contexts:");
            for (String cxt: contexts) {
                System.out.println(cxt);
            }*/

            //POST /contexts/<name>--Create context with name ctxTest and null parameter
            //client.createContext("ctxTest", null);
            //POST /contexts/<name>--Create context with parameters
            /*final Map<String, String> params = new HashMap<>();
            params.put(ISparkJobServerClientConstants.PARAM_MEM_PER_NODE, "256m");
            params.put(ISparkJobServerClientConstants.PARAM_NUM_CPU_CORES, "1");
            boolean ctxflag = client.createContext("cxtTest", params);
            System.out.println(ctxflag);*/
            //DELETE /contexts/<name>
            client.deleteContext("cxtTest");

            //GET /jobs
            /*final List<SparkJobInfo> jobInfos = client.getJobs();
            System.out.println("Current jobs:");
            for (SparkJobInfo jobInfo: jobInfos) {
                System.out.println(jobInfo);
            }*/

            //Post /jobs---Create a new job
            /*final Map<String, String> params = new HashMap<>();
            params.put(ISparkJobServerClientConstants.PARAM_APP_NAME, "sparktest");
            params.put(ISparkJobServerClientConstants.PARAM_CLASS_PATH, "GetWordRdd");
            //1.start a spark job asynchronously and just get the status information
            *//*SparkJobResult result = client.startJob("input.string= fdsafd dfsf blullkfdsoflaw fsdfs", params);
            System.out.println(result);*//*

            //2.start a spark job synchronously and wait until the result
            params.put(ISparkJobServerClientConstants.PARAM_CONTEXT, "cxtTest");
            params.put(ISparkJobServerClientConstants.PARAM_SYNC, "true");
            SparkJobResult result = client.startJob("input.string= fdsafd dfsf blullkfdsoflaw fsdffdsfsfs", params);
            System.out.println(result.getResult());*/

            //GET /jobs/<jobId>---Gets the result or status of a specific job
            /*SparkJobResult result1 = client.getJobResult("4aa49dbd-0c68-4511-80c8-31c681ca5e28");
            System.out.println(result1.getResult());*/

            //GET /jobs/<jobId>/config - Gets the job configuration
            /*final SparkJobConfig jobConfig = client.getConfig("4aa49dbd-0c68-4511-80c8-31c681ca5e28");
            System.out.println(jobConfig);*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                client.stop();
            }
        }
    }


}
