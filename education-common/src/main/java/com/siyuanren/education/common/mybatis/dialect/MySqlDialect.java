/**
 * wusc.edu.pay.common.core.mybatis.dialect.MySqlDialect.java
 */
package com.siyuanren.education.common.mybatis.dialect;


public class MySqlDialect extends Dialect {
	public boolean supportsLimitOffset() {
		return true;
	}

	public boolean supportsLimit() {
		return true;
	}

	public String getLimitString(String sql, int offset, String offsetPlaceholder, int limit, String limitPlaceholder) {

		if (offset > 0) {
			sql += " limit " + offsetPlaceholder + "," + limitPlaceholder;
		} else {
			sql += " limit " + limitPlaceholder;
		}

		return sql;
	}
}
