package com.lincan.mybatisreadwrite.config;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Intercepts({@Signature( type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class,
                ResultHandler.class})})
@Component
public class DataSourceInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] objects = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement) objects[0];
        if (mappedStatement.getSqlCommandType().equals(SqlCommandType.SELECT)) {
            DataSourceContextHolder.setRead();
        } else {
            DataSourceContextHolder.setWrite();
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}
