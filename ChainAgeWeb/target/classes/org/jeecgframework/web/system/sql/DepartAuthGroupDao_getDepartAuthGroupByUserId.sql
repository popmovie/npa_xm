select dag.* from t_s_depart_auth_group as dag join t_s_depart_authg_manager as dam on dam.group_id=dag.id where user_id = :userId 