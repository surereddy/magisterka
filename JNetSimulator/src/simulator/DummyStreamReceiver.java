package simulator;

import java.net.DatagramPacket;

import simulator.UDPSocketAdapter.IUDPSocketAdapterListener;


public class DummyStreamReceiver {
	
	class UDPSocketAdapterListener implements IUDPSocketAdapterListener {

		@Override
		public void onPacketReceived(UDPSocketAdapter socketAdapter,
				DatagramPacket packet) {
			System.out.println("Received " + packet.getLength() + " bytes of data");
		}
		
	}
	
	private UDPSocketAdapterListener mListener = new UDPSocketAdapterListener();
	private UDPSocketAdapter mUDPSocketAdapter;
	
	public DummyStreamReceiver() {
	}
	
	public void setUDPSocketAdapter(UDPSocketAdapter adapter) {
		mUDPSocketAdapter = adapter;
		mUDPSocketAdapter.setReceiveListener(mListener);
	}

}
