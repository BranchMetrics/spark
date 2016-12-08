package io.branch.core;

/**
 * Created by wyan on 12/7/16.
 */
import org.apache.hadoop.fs.s3a.S3AFileSystem;

public class DummyHadoopAws {
    public static void main(String[] args) throws java.io.IOException {
        S3AFileSystem fs1 = new S3AFileSystem();
        return;
    }
}
