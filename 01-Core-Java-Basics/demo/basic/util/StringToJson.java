package demo.basic.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StringToJson {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().create();
		String jsonStr = "  {amiLaunchIndex=0.0, imageId=ami-0323c3dd2da7fb37d, instanceId=i-0d00b8850dcb81fa8, instanceType=t2.micro, keyName=cdpMNCTest, launchTime=Apr 21, 2020 7:14:11 AM, monitoring={state=disabled}, placement={availabilityZone=us-east-1a, groupName=, tenancy=default}, privateDnsName=ip-172-31-85-117.ec2.internal, privateIpAddress=172.31.85.117, productCodes=[], publicDnsName=ec2-3-80-182-198.compute-1.amazonaws.com, publicIpAddress=3.80.182.198, state={code=16.0, name=running}, stateTransitionReason=, subnetId=subnet-c4bc08eb, vpcId=vpc-a25216da, architecture=x86_64, blockDeviceMappings=[{deviceName=/dev/xvda, ebs={attachTime=Apr 21, 2020 7:14:12 AM, deleteOnTermination=true, status=attached, volumeId=vol-01ffd4daa342c274b}}], clientToken=, ebsOptimized=false, enaSupport=true, hypervisor=xen, networkInterfaces=[{association={ipOwnerId=amazon, publicDnsName=ec2-3-80-182-198.compute-1.amazonaws.com, publicIp=3.80.182.198}, attachment={attachTime=Apr 21, 2020 7:14:11 AM, attachmentId=eni-attach-009b826814ca7dcc3, deleteOnTermination=true, deviceIndex=0.0, status=attached}, description=Primary network interface, groups=[{groupName=cdpMNCTest, groupId=sg-018440e47a6fe4e5d}], ipv6Addresses=[], macAddress=12:5a:f8:3a:55:65, networkInterfaceId=eni-0f26cb986c94c0d87, ownerId=693265998683, privateDnsName=ip-172-31-85-117.ec2.internal, privateIpAddress=172.31.85.117, privateIpAddresses=[{association={ipOwnerId=amazon, publicDnsName=ec2-3-80-182-198.compute-1.amazonaws.com, publicIp=3.80.182.198}, primary=true, privateDnsName=ip-172-31-85-117.ec2.internal, privateIpAddress=172.31.85.117}], sourceDestCheck=true, status=in-use, subnetId=subnet-c4bc08eb, vpcId=vpc-a25216da}], rootDeviceName=/dev/xvda, rootDeviceType=ebs, securityGroups=[{groupName=cdpMNCTest, groupId=sg-018440e47a6fe4e5d}], sourceDestCheck=true, tags={mncmonitor=true, Name=cdpMNCTest-I2}, virtualizationType=hvm, cpuOptions={coreCount=1.0, threadsPerCore=1.0}, capacityReservationSpecification={capacityReservationPreference=open}, hibernationOptions={configured=false}}";
		gson.toJson(jsonStr);
		System.out.println("jsonStr is :: " + jsonStr);
	}
}
