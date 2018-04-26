import java.util.List;
import java.util.stream.Stream;

public class StreamMergeChallenge {

	public static void main(String[] args) {
		Stream<String> stream1 = List.of("Luke","Darth Vader").stream();
		Stream<String> stream2 = List.of("Obi Wan","Qui gon jinn").stream();
		Stream<String> stream3 = List.of("Han Solo","Darth Maul","Palpatine").stream();
		
		Stream<Stream<String>> streamOfStreams = Stream.of(stream1,stream2,stream3);
//		long streamOfStreamsCount = streamOfStreams.count();
//		System.out.println(streamOfStreamsCount);
		
		Stream<String> finalStream = streamOfStreams.flatMap(s -> s)
				.filter(s -> s.contains("in"));
		System.out.println(finalStream.count());
//		System.out.println(finalStream.count() + streamOfStreamsCount);
	}

}
