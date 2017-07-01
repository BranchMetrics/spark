Build
---

```bash
./dev/make-distribution.sh --name branchio-spark-2.1.1 --tgz -Phadoop-2.7 -Dhadoop.version=2.7.3 -Phive -Phive-thriftserver -Pmesos -Pyarn -Pscala-2.11 -DskipTests
```

To build with SparkR

```bash
./dev/make-distribution.sh --name branchio-spark-r-2.1.1 --tgz -Phadoop-2.7 -Dhadoop.version=2.7.3 -Phive -Phive-thriftserver -Pmesos -Pyarn -Pscala-2.11 -Psparkr -DskipTests
```

Built package
---

s3://branch-builds/apache/spark/2.1.1/
