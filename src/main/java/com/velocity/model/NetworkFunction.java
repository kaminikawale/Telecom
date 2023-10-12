package com.velocity.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="netWorkFunction")
public class NetworkFunction {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String NetworkFunctionInstanceId;
		private String NetworkFunctionInstanceType;
		private String Status;
		private int heartBeatTimer;
		private NfProfile nfProfile;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNetworkFunctionInstanceId() {
			return NetworkFunctionInstanceId;
		}
		public void setNetworkFunctionInstanceId(String networkFunctionInstanceId) {
			NetworkFunctionInstanceId = networkFunctionInstanceId;
		}
		public String getNetworkFunctionInstanceType() {
			return NetworkFunctionInstanceType;
		}
		public void setNetworkFunctionInstanceType(String networkFunctionInstanceType) {
			NetworkFunctionInstanceType = networkFunctionInstanceType;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public int getHeartBeatTimer() {
			return heartBeatTimer;
		}
		public void setHeartBeatTimer(int heartBeatTimer) {
			this.heartBeatTimer = heartBeatTimer;
		}
		public NfProfile getNfProfile() {
			return nfProfile;
		}
		public void setNfProfile(NfProfile nfProfile) {
			this.nfProfile = nfProfile;
		}
		@Override
		public String toString() {
			return "NetWorkFunction [id=" + id + ", NetworkFunctionInstanceId=" + NetworkFunctionInstanceId
					+ ", NetworkFunctionInstanceType=" + NetworkFunctionInstanceType + ", Status=" + Status
					+ ", heartBeatTimer=" + heartBeatTimer + ", nfProfile=" + nfProfile + "]";
		}

		
	}


