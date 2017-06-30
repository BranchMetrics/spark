Build
---

```bash
./dev/make-distribution.sh --name branchio-spark-2.1.1 --tgz -Phadoop-2.7 -Dhadoop.version=2.7.3 -Phive -Phive-thriftserver -Pmesos -Pyarn -Pscala-2.11 -DskipTests
```