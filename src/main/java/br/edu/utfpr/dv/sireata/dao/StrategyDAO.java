package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

public interface StrategyDAO<T> {
	T buscarPorId(int id) throws SQLException;
}
