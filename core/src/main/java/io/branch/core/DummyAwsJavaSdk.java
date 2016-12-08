package io.branch.core;

/**
 * Created by wyan on 12/7/16.
 */
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

public class DummyAwsJavaSdk {

    public static void main(String[] args) throws java.io.IOException {
        AmazonS3 s3client = new AmazonS3Client();
        return;
    }
}
