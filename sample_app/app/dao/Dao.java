package dao;


import com.google.inject.Inject;
//import org.springframework.ui.Model;

import io.ebean.*;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
//import org.springframework.ui.Model;


import java.lang.reflect.ParameterizedType;

public abstract class Dao<K, T> implements Model {

//        private EbeanServer eBeanIssuingServer;
//        protected Class<T> entityClass;
//        public Finder<K,T> find;
//        @SuppressWarnings({"unchecked"})
//        @Inject
//        public Dao(){
//            this.entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
//                    .getActualTypeArguments()[1];
//            this.eBeanIssuingServer = Ebean.getServer("issuing");
//            this.find = new Finder<>(this.entityClass, "issuing");
//        }
//
//        public ExpressionFactory expression() {
//            return this.eBeanIssuingServer.getExpressionFactory();
//        }
//
//
//        public <T> SqlQuery createSqlQuery(String sql) {
//            return this.eBeanIssuingServer.createSqlQuery(sql);
//        }
//
//        public SqlUpdate createSqlUpdate(String sql) {
//            return this.eBeanIssuingServer.createSqlUpdate(sql);
//        }
//
//        public void executeUpdate(SqlUpdate sql) {
//            this.eBeanIssuingServer.execute(sql);
//        }
//
//        public void save(Object bean) {
//            this.eBeanIssuingServer.save(bean);
//        }
//
//        public Transaction beginTransaction() {
//            return this.eBeanIssuingServer.beginTransaction();
//        }
//
//        public void commitTransaction() {
//            this.eBeanIssuingServer.commitTransaction();
//        }
//
//        public void rollbackTransaction() {
//            this.eBeanIssuingServer.rollbackTransaction();
//        }
//
//        public void endTransaction() {
//            this.eBeanIssuingServer.endTransaction();
//        }
//
//        public void saveAll(Collection collBean) {
//            if(collBean != null && collBean.size()>0)
//                this.eBeanIssuingServer.saveAll(collBean);
//        }
//
//        public void updateAll(Collection collBean){
//            if(collBean!=null && !collBean.isEmpty())
//                this.eBeanIssuingServer.updateAll(collBean);
//        }
//
//        public void update(Object bean) {
//            this.eBeanIssuingServer.update(bean);
//        }
//
//        public <T> Query<T> find(Class<T> beanType) {
//            return this.eBeanIssuingServer.find(beanType);
//        }
//
//        public void refresh(Object bean) {
//            this.eBeanIssuingServer.refresh(bean);
//        }
//
//        public <T> Query<T> createQuery(Class<T> beanType) {
//            return this.eBeanIssuingServer.createQuery(beanType);
//        }
//
//        public void delete(Object bean){
//            this.eBeanIssuingServer.delete(bean);
//        }

    }



